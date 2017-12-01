package Domz5;

public class PrivateMessage extends Message {
    private User destinationUser;

    public User getDestinationUser() {
        return destinationUser;
    }

    public void setDestinationUser(User destinationUser) {
        this.destinationUser = destinationUser;
    }

    @Override
    public void send() {
        System.out.println("Отправлено сообщение пользователю " + destinationUser);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivateMessage)) return false;
        if (!super.equals(o)) return false;

        PrivateMessage that = (PrivateMessage) o;

        return destinationUser != null ? destinationUser.equals(that.destinationUser) : that.destinationUser == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (destinationUser != null ? destinationUser.hashCode() : 0);
        return result;
    }
}
