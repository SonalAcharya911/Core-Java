public class Electronics {
    String name;
    String category;
    String brand;
    double price;
    boolean wireless;
    String processor;
    String color;
    int storage;
    int warranty;
    boolean touchScreen;

    Electronics(){
        System.out.println("running empty constructor in Electronics");
    }
    Electronics(String name,String brand){
        System.out.println("running String,String constructor in Electronics");
        this.name=name;
        this.brand=brand;
    }

    Electronics(String name,String category,double price){
        System.out.println("running String,String,double constructor in Electronics");
        this.name=name;
        this.category=category;
        this.price=price;
    }

    Electronics(String name,String color,boolean wireless){
        System.out.println("running String,String constructor in Electronics");
        this.name=name;
        this.color=color;
        this.wireless=wireless;
    }

    Electronics(String name,String processor,int storage){
        System.out.println("running String,String constructor in Electronics");
        this.name=name;
        this.processor=processor;
        this.storage=storage;
    }

    Electronics(String name,int warranty,boolean touchScreen){
        System.out.println("running String,String constructor in Electronics");
        this.name=name;
        this.warranty=warranty;
        this.touchScreen=touchScreen;
    }

    public void info(){
        System.out.println("running info in Electronics");
        System.out.println("name: "+name);
        System.out.println("category: "+category);
        System.out.println("brand: "+brand);
        System.out.println("price: "+price);
        System.out.println("wireless: "+wireless);
        System.out.println("processor: "+processor);
        System.out.println("color: "+color);
        System.out.println("storage: "+storage);
        System.out.println("warranty: "+warranty);
        System.out.println("name: "+touchScreen);

    }
}
