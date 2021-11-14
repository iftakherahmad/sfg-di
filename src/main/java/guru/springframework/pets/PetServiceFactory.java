package guru.springframework.pets;

/**
 * @author iftakhar.ahmed
 * @since 11/14/21
 */
public class PetServiceFactory {

    public PetService getPetService(String type){
        switch (type){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}