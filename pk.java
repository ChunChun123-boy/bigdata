package game;
import java.util.Scanner;

class input1{
    String iname;
    int il,ia,id;
    public void Idata(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<10;i++) {
            System.out.println("请输入主角名称：(英文)【少于50】");
            String name1 = sc.nextLine();
            if (name1.length() >= 1 && name1.length() <= 50) {
                 iname = name1;
                break;
            } else {
                System.out.println("输入名字有误，请重新输入");
            }
        }
        for (int i = 0;i<10;i++) {
                System.out.println("请输入主角生命值：【大于1 小于999】");
                int life1 = sc.nextInt();
                if (life1 >= 1 &&life1 <= 999) {
                     il= life1;
                    break;
                } else {
                    System.out.println("输入生命值有误，请重新输入");
                }
        }
        for (int i = 0;i<10;i++) {
            System.out.println("请输入主角攻击力：【大于1 小于999】");
            int attack1 = sc.nextInt();
            if (attack1 >= 1 &&attack1 <= 999) {
                 ia= attack1;
                break;
            } else {
                System.out.println("输入攻击力有误，请重新输入");
            }
        }
        for (int i = 0;i<10;i++) {
            System.out.println("请输入主角防御力：【大于1 小于999】");
            int defense1 = sc.nextInt();
            if (defense1>= 1 && defense1<= 999) {
                 id= defense1;
                break;
            } else {
                System.out.println("输入防御力有误，请重新输入");
            }
        }
    }
    String Mname = "哥布林";
    int Mattack = 10;
    int Mlife = 100;
    public void Mdata(){
        System.out.println("你遇见了一只哥布林，你需要战胜他 \n Hp:100 伤害:10 防御:0");

    }
   public void PK(){
       Mattack = Mattack - id;
       if (Mattack<=0){
           Mattack = 1;
       }
       for(int i = 0; i<200;i++){
           Mlife = Mlife - ia;
           il = il - Mattack;
           System.out.println( iname + "对哥布林造成了"+ ia +"伤害");
           System.out.println("哥布林：HP："+ Mlife );
           if (Mlife <= 0 ){
               System.out.println("你成功击败了哥布林，抱得美人归");
               break;
           }
           System.out.println("哥布林对"+ iname + "造成了"+ Mattack+"伤害");
           System.out.println(iname+"HP:"+il);
           if (il <=0){
               System.out.println("你被哥布林消灭了，真是个彩笔！！！");
               break;
           }
       }
   }
}
public class pk {
    public static void main(String[] args) {
        input1 i = new input1();
        i.Idata();
        i.Mdata();
        i.PK();
    }
}
