import java.util.*;

class animal{
    String name;
    double high;
    int weight;
    double speed;

    void showLine(){
        System.out.println("名稱:" + name);
        System.out.println("身高:" + high + "m");
        System.out.println("名稱:" + weight + "kg");
        System.out.println("速度:" + speed + "m/min");
        System.out.println("----------------------------");
    }  
    void show(){
        System.out.println("名稱:" + name);
        System.out.println("身高:" + high + "m");
        System.out.println("名稱:" + weight + "kg");
        System.out.println("速度:" + speed + "m/min");
    }

    void distance(int x,double y){
        System.out.println(x * y * speed + "m");
    }
    void distance2(int z){
        System.out.println(z * speed);
    }
}

public class A1113337_0324_1{
    public static void main(String[] args){
        animal snow = new animal();
        snow.name = "雪寶";
        snow.high = 1.1;
        snow.weight = 52;
        snow.speed = 100;
        snow.showLine();

        animal donkey = new animal();
        donkey.name = "驢子";
        donkey.high = 1.5;
        donkey.weight = 99;
        donkey.speed = 200;
        donkey.showLine();

        animal anna = new animal();
        anna.name = "安那";
        anna.high = 1.7;
        anna.weight = 48;
        anna.speed = 120;
        anna.show();

        animal aisha = new animal();
        aisha.name = "愛沙";
        aisha.high = 1.7;
        aisha.weight = 50;
        aisha.speed = 120;
        aisha.show();

        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入時間(分鐘):");
        int a = sc.nextInt();
        System.out.print("請輸入加速度:");
        double b = sc.nextDouble();

        snow.distance(a, b);
        donkey.distance(a, b);
        anna.distance(a, b);
        aisha.distance(a, b);
        
        

        

        



    }
}