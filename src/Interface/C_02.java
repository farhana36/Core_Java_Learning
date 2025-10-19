package Interface;
/*
Write a program to demonstrate interface --- 2 - 3 program ( extends )
 */
public class C_02  extends C_01
{    // public class C_02 extends I_01, I_02 {class cannot extend interface, C_02 either be declared abstract or
                                             // means it cannot extend more than one class, but can implement many interferance
                                          // implement abstract method m03 in I_01}

    public void m05(){
        System.out.println("From m05 C_02 class");
    }

    public void m06(){
        System.out.println("From m06 C_02 class");
    }


}
