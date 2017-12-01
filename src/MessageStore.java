public class MessageStore {
    private Message[] messages = new Message[10];

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }

    public void add() {
        messages[0] = new Message();
    }
}
