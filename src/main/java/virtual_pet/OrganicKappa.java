package virtual_pet;
public class OrganicKappa extends OrganicPet implements Walking {

    public OrganicKappa(String name, String petType, int hunger, int hygiene, int thirst, int fun) {
        super(name, petType, hunger, hygiene, thirst, fun);
    }

    @Override
    public void walk() {
    }


}



