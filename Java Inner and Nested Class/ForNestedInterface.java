interface ForNestedInterdace{
    interface Message{
        void method();
    }
    class TestMessage implements Message{
        @Override
        public void method() {
            System.out.println("Implemented nested interface");
        }
    }

    public static void main(String[] args) {
        ForNestedInterdace.TestMessage testMessage=new TestMessage();
        testMessage.method();
    }
}