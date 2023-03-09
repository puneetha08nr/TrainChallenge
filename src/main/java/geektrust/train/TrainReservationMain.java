package geektrust.train;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrainReservationMain {

    public static void main(String[] args) throws IOException {

        //String fileName = args[0];
        String fileName = "C:\\Users\\Kishore\\Desktop\\Train\\input.txt";
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Train> trains = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split("ENGINE");
            String trainName = strings[0].trim();
            ArrayList<Bogie> bogies = new ArrayList<>();
            Arrays.stream(strings[1].trim().split(" ")).forEach(s -> {
                bogies.add(new Bogie(s));
            });
            trains.add(new Train(trainName, bogies));
        }
        bufferedReader.close();
        trains.forEach(Train::orderOfExistingBogies);

        trains.forEach(train -> {
            String name = train.getName();
            String bogies = getCollect(train.getBogies());
            System.out.println("ARRIVAL " + name + " ENGINE " + bogies);
        });
        ArrayList<Bogie> mergedBogies = new ArrayList<>();
        trains.forEach(train -> {
            mergedBogies.addAll(train.getBogies());
        });
        List<Bogie> departureBogies = mergedBogies.stream()
                .filter(station -> !"HYB".equalsIgnoreCase(station.getName()))
                .sorted(Comparator.comparing(Bogie::distanceAfterHyderabad, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        System.out.println("DEPARTURE TRAIN_AB ENGINE ENGINE " + getCollect(departureBogies));
    }

    private static String getCollect(List<Bogie> bogies) {
        return bogies.stream().map(Bogie::getName).collect(Collectors.joining(" "));
    }
}

