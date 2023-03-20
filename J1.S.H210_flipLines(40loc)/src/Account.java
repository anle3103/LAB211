public class Account {

    private boolean processCall;

    public Account() {
    }
    
    public Account(Client c) {
        processCall = false;
    }

    boolean process(Transaction t) {
        processCall = true;
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