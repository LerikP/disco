import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class for getting random Person(s)
 */
class PersonFactory {
    private Faker faker = new Faker();
    private ThreadLocalRandom random = ThreadLocalRandom.current();

    /**
     * Used to get random person
     * @return Person
     */
    private Person getRandomPerson() {
        return Person.builder()
                .withName(faker.name().firstName())
                .withGender(random.nextBoolean() ? "F" : "M")
                .withDance(Utils.getRandomSongs())
                .build();
    }

    /**
     * Used to get list of random people using {@link #getRandomPerson}
     * @param peopleCount required people count
     * @return List of Person
     */
    private List<Person> getRandomPeople(Integer peopleCount) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < peopleCount; i++) {
            people.add(getRandomPerson());
        }
        return people;
    }

    /**
     * Used to get list of random people with random count in range [3, 12]
     * @return List of Person
     */
    List<Person> getRandomPeople() {
        return getRandomPeople(random.nextInt(10) + 3);
    }
}
