public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+380678594000", "Lenovo", 7.5);
        Phone phone2 = new Phone("+380678596656", "Asus", 7.6);
        Phone phone3 = new Phone("+380678596700", "Acer", 7.0);
        Phone phone4 = new Phone("+380678594222", "Samsung");
        Phone phone5 = new Phone();

       /* phone1.setDim("+380678594000", "Lenovo", 7.5);
        phone2.setDim("+380678594056", "Asus", 7.6);
        phone3.setDim("+380678596700", "Acer", 7.0);*/

        System.out.println("Характеристики phone1: " + phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println("Характеристики phone2: " + phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println("Характеристики phone3: " + phone3.number + " " + phone3.model + " " + phone3.weight);
        System.out.println("Характеристики phone4: " + phone4.number + " " + phone4.model);


        phone1.receiveCall("Таня");
        phone2.receiveCall("Коля");
        phone3.receiveCall("Женя");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}
