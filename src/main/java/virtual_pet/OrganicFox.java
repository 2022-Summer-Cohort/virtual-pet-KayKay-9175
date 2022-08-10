package virtual_pet;

public class OrganicFox extends OrganicPet implements Walking  {

    public OrganicFox(String name, String petType, int hunger, int hygiene, int thirst, int fun) {
        super(name, petType, hunger, hygiene, thirst, fun);
    }


    @Override
    public void walk() {

    }
}
