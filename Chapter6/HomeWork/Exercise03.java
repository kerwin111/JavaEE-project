package Chapter6.HomeWork;

public class Exercise03 {
    public static void main(String[] args) {
        Book book = new Book(300,"笑傲江湖");
        book.info();
        book.updatePrice();
        book.info();
    }
}

class Book{
    int price;
    String name;
    public Book(int price,String name){
        this.price = price;
        this.name = name;
    }
    public void updatePrice(){
        if (this.price>150){
            this.price = 150;
        }else if (this.price >100){
            this.price = 100;
        }
    }

    public void info(){
        System.out.println("书的名字为:"+name+",书的价格为:"+price);
    }
}