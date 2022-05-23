package wangkai.graduationProject.exceptions;

public class UserNotFindException {
    public class MyException extends Exception {
        public MyException() {
            super();
        }
        public MyException(String str) {
            super(str);
        }
    }
}
