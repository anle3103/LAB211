public class Account {
    private Client c;
    private boolean approved;

    public Account() {
    }

    public Account(Client c) {
        this.c = c;
    }

    boolean process(Transaction t) {
        approved = true;
        return t.value() > Integer.MIN_VALUE && t.value() < Integer.MAX_VALUE;
    }

    public class Transaction {

        private int transValue;

        public Transaction(int transValue) {
            this.transValue = transValue;
        }

        public int value() {
            return transValue;
        }
    }

    public class Client {
    }
}
