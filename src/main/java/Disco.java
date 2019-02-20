import java.util.List;
import java.util.concurrent.TimeUnit;

public class Disco {
    public static void main(String[] args) throws InterruptedException {
        PersonFactory personFactory = new PersonFactory();
        List<Person> people = personFactory.getRandomPeople();
        Utils.peopleReport(people);

        while (true) {
            Song currentSong = Utils.getRandomSong();
            currentSong.reportStatus();
            people.forEach(person -> person.reportStatus(currentSong));
            System.out.println();
            TimeUnit.SECONDS.sleep(5);
        }
    }
}
