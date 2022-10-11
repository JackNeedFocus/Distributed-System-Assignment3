import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

/* 
 * A map that stores the URL for each member
 */

public class UrlList {
    
    private final String UrlLearnerFilename = "URL_learner.txt";
    private final String UrlProposerFilename = "URL_proposer.txt";
    private final String UrlAcceptorFilename = "URL_acceptor.txt";

    private Map<String, String> urlLearnerMap;
    private Map<String, String> urlProposerMap;
    private Map<String, String> urlAcceptorMap;

    /*
     * This constructor reads the URL list file and construct the maps
     */
    public UrlList() {
        Scanner scanner;
        try {
            // construct the learner map
            scanner = new Scanner(new File(UrlLearnerFilename));
            while (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split("-", 2);
                urlLearnerMap.put(strings[0], strings[1]);
            }

            // construct the proposer map
            scanner = new Scanner(new File(UrlProposerFilename));
            while (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split("-", 2);
                urlProposerMap.put(strings[0], strings[1]);
            }

            // construct the acceptor map
            scanner = new Scanner(new File(UrlAcceptorFilename));
            while (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split("-", 2);
                urlAcceptorMap.put(strings[0], strings[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("URLList failed to construct.");
            e.printStackTrace();
        }
    }

    public Map<String, String> getUrlLearnerMap() {
        return urlLearnerMap;
    }

    public Map<String, String> getUrlProposerMap() {
        return urlProposerMap;
    }

    public Map<String, String> getUrlAcceptorMap() {
        return urlAcceptorMap;
    }
}
