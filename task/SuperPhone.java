package task;

public class SuperPhone extends TelephoneAbstract {

    @Override
    public void mode() {
        System.out.println("Без пароля");
    }

    @Override
    public void pin() {
        System.out.println("Пинкод");
    }

    @Override
    public void fingerprint() {
        System.out.println("Отпечаток пальца");
    }

    @Override
    public void faceID() {
        System.out.println("Распознавание по лицу");
    }
}