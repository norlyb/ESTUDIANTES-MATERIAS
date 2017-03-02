
package b;

public class A {

    private int a1;
    private B[] bs; //relacionando con B
    private int ins;

    public A() {
        bs = new B[6]; //relacionando con B, ejemplo: si B son las materias, A es estudiante.. para ver las materias se relacionan con B 
    }

    public A(int a, B[] b) {
        if (b.length < 6) {
            this.bs = b;
        }
    }

    public void addB(B b) {
        if(ins < 6){
          bs[ins]=b;
          ins++;
        }
    }

    public int geta1() {
        return a1;
    }

    public void seta1(int seta1) {
        this.a1 = a1;
    }

    public void imprimirB() {
        for (B b : bs) {
            System.out.println("las materias de Laura son " + b.getB1());
        }
    }
}
    
   


