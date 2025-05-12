public class Child extends Person{

    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;

    public Child(String name, int age, Parent parent1, Parent parent2){
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[0];
    }

    public Parent getParent1(){
        return this.parent1;
    }

    public Parent getParent2(){
        return this.parent2;
    }

    public Child[] getSiblings(){
        return this.siblings;
    }

    public void setSiblings(Child[] sibs){
        this.siblings = sibs;
    }

    public void addSibling(Child sib){

        Child[] tempsib = this.siblings;

        this.siblings = new Child[tempsib.length+1];

        for (int i =0; i<tempsib.length; i++){
            this.siblings[i] = tempsib[i];
        }
        this.siblings[tempsib.length] = sib;
    }
}