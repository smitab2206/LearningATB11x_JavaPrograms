package Ex_25_OOPs_Abstraction_Interface;

public class Lab201_Interview {
}
interface A11{}
interface A12{}
class A{}
class B{}
abstract class Pramod{
    abstract void pp();
}

class Test1 extends A{}
//class Test2 extends A{},B{}//Mutiple inheritance in class not Aloowed
class Test3 implements A11{}
class Test4 implements A11,A12{}
class Test5 extends A implements A11,A12{}
//class Test6 implements A11 extends A{} // Not allowed
interface A3 extends A11,A12{}
