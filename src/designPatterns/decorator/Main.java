package designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Dessert dessert = new ChocoScoop(
                            new VanillaScoop(
                                    new ChocoSyrup(
                                        new OrangeCone())));

        System.out.println(dessert.getCost());
        System.out.println(dessert.getDescription());
    }
}

/*
            Orange Cone

            Dessert d = new ChocoScoop(new Orange());

            sout(d.cost)
            sout(d.description)




            Dessert d = new OrangeCone();
            Dessert d1 = new ChocoSyrup(d);

            sout(d1.cost)
            sout(d1.description)
 */