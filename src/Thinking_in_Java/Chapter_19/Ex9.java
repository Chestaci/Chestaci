package Thinking_in_Java.Chapter_19;

import net.mindview.util.Enums;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

import static Thinking_in_Java.Chapter_19.PostOffice2.MailHandler2.*;
import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Ex9 {
}


class Mail2 {
    // The NO’s lower the probability of random selection:
    enum GeneralDelivery2 {YES2,NO12,NO22,NO32,NO42,NO52}
    enum Scannability2 {UNSCANNABLE2,YES12,YES22,YES32,YES42}
    enum Readability2 {ILLEGIBLE2,YES12,YES22,YES32,YES42}
    enum Address2 {INCORRECT2,OK12,OK22,OK32,OK42,OK52,OK62}
    enum ReturnAddress2 {MISSING2,OK12,OK22,OK32,OK42,OK52}

    enum Forward2 {NOTFORWARDING2,OK12,OK22,OK32,OK42,OK52} //////////////////////////////////////////////////////////

    GeneralDelivery2 generalDelivery;
    Scannability2 scannability;
    Readability2 readability;
    Address2 address;
    ReturnAddress2 returnAddress;

    Forward2 forward;//////////////////////////////////////////////////////////

    static long counter = 0;
    long id = counter++;
    public String toString() { return "Mail " + id; }
    public String details() {
        return toString() +
                ", General Delivery: " + generalDelivery +
                ", Address Scanability: " + scannability +
                ", Address Readability: " + readability +
                ", Address Address: " + address +
                ", Return address: " + returnAddress +
                ", Forward: " + forward;//////////////////////////////////////////////////////////
    }
    // Generate test Mail:
    public static Mail2 randomMail() {
        Mail2 m = new Mail2();
        m.generalDelivery= Enums.random(GeneralDelivery2.class);
        m.scannability = Enums.random(Scannability2.class);
        m.readability = Enums.random(Readability2.class);
        m.address = Enums.random(Address2.class);
        m.returnAddress = Enums.random(ReturnAddress2.class);

        m.forward = Enums.random(Forward2.class);//////////////////////////////////////////////////////////

        return m;
    }
    public static Iterable<Mail2> generator(final int count) {
        return new Iterable<Mail2>() {
            int n = count;
            public Iterator<Mail2> iterator() {
                return new Iterator<Mail2>() {
                    public boolean hasNext() { return n-- > 0; }
                    public Mail2 next() { return randomMail(); }
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}



interface CommandMail{
    boolean handle(Mail2 mail2);
}




class PostOffice2 {

    static EnumMap<MailHandler2, CommandMail> enumMap = new EnumMap<MailHandler2, CommandMail>(MailHandler2.class);

    static {
        enumMap.put(GENERAL_DELIVERY2, new CommandMail() {
            @Override
            public boolean handle(Mail2 mail2) {
                switch (mail2.generalDelivery) {
                    case YES2:
                        print("Using general delivery for " + mail2);
                        return true;
                    default:
                        return false;
                }
            }
        });

        enumMap.put(MACHINE_SCAN2, new CommandMail() {
            @Override
            public boolean handle(Mail2 mail2) {
                switch (mail2.scannability) {
                    case UNSCANNABLE2:
                        return false;
                    default:
                        switch (mail2.address) {
                            case INCORRECT2:
                                return false;
                            default:
                                print("Delivering " + mail2 + " automatically");
                                return true;
                        }
                }
            }
        });
        enumMap.put(VISUAL_INSPECTION2, new CommandMail() {
            @Override
            public boolean handle(Mail2 mail2) {
                switch (mail2.readability) {
                    case ILLEGIBLE2:
                        return false;
                    default:
                        switch (mail2.address) {
                            case INCORRECT2:
                                return false;
                            default:
                                print("Delivering " + mail2 + " normally");
                                return true;
                        }
                }
            }
        });
        enumMap.put(RETURN_TO_SENDER2, new CommandMail() {
            @Override
            public boolean handle(Mail2 mail2) {
                switch (mail2.returnAddress) {
                    case MISSING2:
                        return false;
                    default:
                        print("Returning " + mail2 + " to sender");
                        return true;
                }
            }
        });
        enumMap.put(FORWARD_ADRESS2, new CommandMail() {
            @Override
            public boolean handle(Mail2 mail2) {
                switch (mail2.forward) {
                    case NOTFORWARDING2:
                        return false;
                    default:
                        print("Using forwarding delivery to " + mail2);
                        return true;
                }
            }
        });
    }

    enum MailHandler2 {
        GENERAL_DELIVERY2,
        MACHINE_SCAN2,
        VISUAL_INSPECTION2,
        RETURN_TO_SENDER2,
        FORWARD_ADRESS2
    }

    static void handle(Mail2 m) {
        for (CommandMail cmdml : enumMap.values())
            if (cmdml.handle(m))
                return;
        print(m + " is a dead letter");
    }

    public static void main(String[] args) {
        for(Mail2 mail : Mail2.generator(10)) {
            print(mail.details());
            handle(mail);
            print("*****");
        }
    }
}