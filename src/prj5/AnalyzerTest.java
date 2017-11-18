/**
 * 
 */
package prj5;

import student.TestCase;

/**
 * test for analyzer
 * 
 * @author dylan hitt dylanh6
 * @version nov 16, 2017
 *
 */
public class AnalyzerTest extends TestCase {
    private Analyzer an;
    /**
     * setup method
     */
    public void setUp() {
        
        
        
        an = new Analyzer();     
        
    }
    
    /**
     * testing the representation method in the analyzer
     */
    public void testInput() {
        
        an.getClass();
        String[] args = { "MusicSurveyDataNo"
                + "GenreRepeats.csv", "SongListNoGenreRepeats.csv" };
        Input.main(args);
        
        String y = "song title party rock anthem\r\n" + 
                "song artist lmfao\r\n" + 
                "song genre edm\r\n" + 
                "song year 2011\r\n" + 
                "heard\r\n" + 
                "reading86 art79 sports87 music87\r\n" + 
                "likes\r\n" + 
                "reading53 art50 sports47 music43\r\n" + 
                "\r\n" + 
                "song title no one\r\n" + 
                "song artist alicia keys\r\n" + 
                "song genre rb\r\n" + 
                "song year 2007\r\n" + 
                "heard\r\n" + 
                "reading46 art30 sports56 music59\r\n" + 
                "likes\r\n" + 
                "reading35 art18 sports40 music41\r\n" + 
                "\r\n" + 
                "song title all these things ive done\r\n" + 
                "song artist the killers\r\n" + 
                "song genre alternative\r\n" + 
                "song year 2005\r\n" + 
                "heard\r\n" + 
                "reading41 art37 sports34 music35\r\n" + 
                "likes\r\n" + 
                "reading41 art40 sports33 music38\r\n" + 
                "\r\n" + 
                "song title i will always love you\r\n" + 
                "song artist whitney houston\r\n" + 
                "song genre country\r\n" + 
                "song year 1973\r\n" + 
                "heard\r\n" + 
                "reading80 art83 sports65 music81\r\n" + 
                "likes\r\n" + 
                "reading51 art54 sports47 music53\r\n" + 
                "\r\n" + 
                "song title call me\r\n" + 
                "song artist blondie\r\n" + 
                "song genre dance rock\r\n" + 
                "song year 1980\r\n" + 
                "heard\r\n" + 
                "reading46 art41 sports22 music42\r\n" + 
                "likes\r\n" + 
                "reading44 art26 sports20 music30\r\n" + 
                "\r\n" + 
                "song title another one bites the dust\r\n" + 
                "song artist queen\r\n" + 
                "song genre disco\r\n" + 
                "song year 1980\r\n" + 
                "heard\r\n" + 
                "reading93 art83 sports87 music80\r\n" + 
                "likes\r\n" + 
                "reading83 art63 sports67 music70\r\n" + 
                "\r\n" + 
                "song title tik tok\r\n" + 
                "song artist keha\r\n" + 
                "song genre electronic\r\n" + 
                "song year 2009\r\n" + 
                "heard\r\n" + 
                "reading80 art79 sports79 music84\r\n" + 
                "likes\r\n" + 
                "reading46 art25 sports37 music42\r\n" + 
                "\r\n" + 
                "song title american pie\r\n" + 
                "song artist don mclean\r\n" + 
                "song genre folk rock\r\n" + 
                "song year 1971\r\n" + 
                "heard\r\n" + 
                "reading73 art58 sports63 music68\r\n" + 
                "likes\r\n" + 
                "reading62 art47 sports54 music63\r\n" + 
                "\r\n" + 
                "song title life on mars\r\n" + 
                "song artist david bowie\r\n" + 
                "song genre glam rock\r\n" + 
                "song year 1971\r\n" + 
                "heard\r\n" + 
                "reading13 art13 sports11 music32\r\n" + 
                "likes\r\n" + 
                "reading14 art9 sports10 music24\r\n" + 
                "\r\n" + 
                "song title smells like teen spirit\r\n" + 
                "song artist nirvana\r\n" + 
                "song genre grunge\r\n" + 
                "song year 1991\r\n" + 
                "heard\r\n" + 
                "reading63 art62 sports59 music71\r\n" + 
                "likes\r\n" + 
                "reading51 art47 sports55 music63\r\n" + 
                "\r\n" + 
                "song title boom boom pow\r\n" + 
                "song artist the black eyed peas\r\n" + 
                "song genre hip hop\r\n" + 
                "song year 2009\r\n" + 
                "heard\r\n" + 
                "reading90 art75 sports91 music85\r\n" + 
                "likes\r\n" + 
                "reading43 art29 sports47 music27\r\n" + 
                "\r\n" + 
                "song title take me to church\r\n" + 
                "song artist hozier\r\n" + 
                "song genre indie rock\r\n" + 
                "song year 2013\r\n" + 
                "heard\r\n" + 
                "reading73 art66 sports80 music83\r\n" + 
                "likes\r\n" + 
                "reading62 art52 sports54 music61\r\n" + 
                "\r\n" + 
                "song title bad blood\r\n" + 
                "song artist taylor swift\r\n" + 
                "song genre pop\r\n" + 
                "song year 2015\r\n" + 
                "heard\r\n" + 
                "reading83 art79 sports84 music90\r\n" + 
                "likes\r\n" + 
                "reading51 art47 sports53 music46\r\n" + 
                "\r\n" + 
                "song title all you need is love\r\n" + 
                "song artist the beatles\r\n" + 
                "song genre pop rock\r\n" + 
                "song year 1967\r\n" + 
                "heard\r\n" + 
                "reading90 art70 sports72 music81\r\n" + 
                "likes\r\n" + 
                "reading79 art56 sports61 music72\r\n" + 
                "\r\n" + 
                "song title anarchy in the uk\r\n" + 
                "song artist the sex pistols\r\n" + 
                "song genre punk\r\n" + 
                "song year 1976\r\n" + 
                "heard\r\n" + 
                "reading20 art12 sports31 music38\r\n" + 
                "likes\r\n" + 
                "reading22 art8 sports31 music29\r\n" + 
                "\r\n" + 
                "song title every breath you take\r\n" + 
                "song artist the police\r\n" + 
                "song genre rock\r\n" + 
                "song year 1983\r\n" + 
                "heard\r\n" + 
                "reading66 art58 sports65 music69\r\n" + 
                "likes\r\n" + 
                "reading51 art43 sports52 music62\r\n" + 
                "\r\n" + 
                "song title imagine\r\n" + 
                "song artist john lennon\r\n" + 
                "song genre soft rock\r\n" + 
                "song year 1971\r\n" + 
                "heard\r\n" + 
                "reading63 art58 sports66 music72\r\n" + 
                "likes\r\n" + 
                "reading58 art43 sports60 music60\r\n" + 
                "\r\n" + 
                "song title all these things ive done\r\n" + 
                "song artist the killers\r\n" + 
                "song genre alternative\r\n" + 
                "song year 2005\r\n" + 
                "heard\r\n" + 
                "reading41 art37 sports34 music35\r\n" + 
                "likes\r\n" + 
                "reading41 art40 sports33 music38\r\n" + 
                "\r\n" + 
                "song title all you need is love\r\n" + 
                "song artist the beatles\r\n" + 
                "song genre pop rock\r\n" + 
                "song year 1967\r\n" + 
                "heard\r\n" + 
                "reading90 art70 sports72 music81\r\n" + 
                "likes\r\n" + 
                "reading79 art56 sports61 music72\r\n" + 
                "\r\n" + 
                "song title american pie\r\n" + 
                "song artist don mclean\r\n" + 
                "song genre folk rock\r\n" + 
                "song year 1971\r\n" + 
                "heard\r\n" + 
                "reading73 art58 sports63 music68\r\n" + 
                "likes\r\n" + 
                "reading62 art47 sports54 music63\r\n" + 
                "\r\n" + 
                "song title anarchy in the uk\r\n" + 
                "song artist the sex pistols\r\n" + 
                "song genre punk\r\n" + 
                "song year 1976\r\n" + 
                "heard\r\n" + 
                "reading20 art12 sports31 music38\r\n" + 
                "likes\r\n" + 
                "reading22 art8 sports31 music29\r\n" + 
                "\r\n" + 
                "song title another one bites the dust\r\n" + 
                "song artist queen\r\n" + 
                "song genre disco\r\n" + 
                "song year 1980\r\n" + 
                "heard\r\n" + 
                "reading93 art83 sports87 music80\r\n" + 
                "likes\r\n" + 
                "reading83 art63 sports67 music70\r\n" + 
                "\r\n" + 
                "song title bad blood\r\n" + 
                "song artist taylor swift\r\n" + 
                "song genre pop\r\n" + 
                "song year 2015\r\n" + 
                "heard\r\n" + 
                "reading83 art79 sports84 music90\r\n" + 
                "likes\r\n" + 
                "reading51 art47 sports53 music46\r\n" + 
                "\r\n" + 
                "song title boom boom pow\r\n" + 
                "song artist the black eyed peas\r\n" + 
                "song genre hip hop\r\n" + 
                "song year 2009\r\n" + 
                "heard\r\n" + 
                "reading90 art75 sports91 music85\r\n" + 
                "likes\r\n" + 
                "reading43 art29 sports47 music27\r\n" + 
                "\r\n" + 
                "song title call me\r\n" + 
                "song artist blondie\r\n" + 
                "song genre dance rock\r\n" + 
                "song year 1980\r\n" + 
                "heard\r\n" + 
                "reading46 art41 sports22 music42\r\n" + 
                "likes\r\n" + 
                "reading44 art26 sports20 music30\r\n" + 
                "\r\n" + 
                "song title every breath you take\r\n" + 
                "song artist the police\r\n" + 
                "song genre rock\r\n" + 
                "song year 1983\r\n" + 
                "heard\r\n" + 
                "reading66 art58 sports65 music69\r\n" + 
                "likes\r\n" + 
                "reading51 art43 sports52 music62\r\n" + 
                "\r\n" + 
                "song title i will always love you\r\n" + 
                "song artist whitney houston\r\n" + 
                "song genre country\r\n" + 
                "song year 1973\r\n" + 
                "heard\r\n" + 
                "reading80 art83 sports65 music81\r\n" + 
                "likes\r\n" + 
                "reading51 art54 sports47 music53\r\n" + 
                "\r\n" + 
                "song title imagine\r\n" + 
                "song artist john lennon\r\n" + 
                "song genre soft rock\r\n" + 
                "song year 1971\r\n" + 
                "heard\r\n" + 
                "reading63 art58 sports66 music72\r\n" + 
                "likes\r\n" + 
                "reading58 art43 sports60 music60\r\n" + 
                "\r\n" + 
                "song title life on mars\r\n" + 
                "song artist david bowie\r\n" + 
                "song genre glam rock\r\n" + 
                "song year 1971\r\n" + 
                "heard\r\n" + 
                "reading13 art13 sports11 music32\r\n" + 
                "likes\r\n" + 
                "reading14 art9 sports10 music24\r\n" + 
                "\r\n" + 
                "song title no one\r\n" + 
                "song artist alicia keys\r\n" + 
                "song genre rb\r\n" + 
                "song year 2007\r\n" + 
                "heard\r\n" + 
                "reading46 art30 sports56 music59\r\n" + 
                "likes\r\n" + 
                "reading35 art18 sports40 music41\r\n" + 
                "\r\n" + 
                "song title party rock anthem\r\n" + 
                "song artist lmfao\r\n" + 
                "song genre edm\r\n" + 
                "song year 2011\r\n" + 
                "heard\r\n" + 
                "reading86 art79 sports87 music87\r\n" + 
                "likes\r\n" + 
                "reading53 art50 sports47 music43\r\n" + 
                "\r\n" + 
                "song title smells like teen spirit\r\n" + 
                "song artist nirvana\r\n" + 
                "song genre grunge\r\n" + 
                "song year 1991\r\n" + 
                "heard\r\n" + 
                "reading63 art62 sports59 music71\r\n" + 
                "likes\r\n" + 
                "reading51 art47 sports55 music63\r\n" + 
                "\r\n" + 
                "song title take me to church\r\n" + 
                "song artist hozier\r\n" + 
                "song genre indie rock\r\n" + 
                "song year 2013\r\n" + 
                "heard\r\n" + 
                "reading73 art66 sports80 music83\r\n" + 
                "likes\r\n" + 
                "reading62 art52 sports54 music61\r\n" + 
                "\r\n" + 
                "song title tik tok\r\n" + 
                "song artist keha\r\n" + 
                "song genre electronic\r\n" + 
                "song year 2009\r\n" + 
                "heard\r\n" + 
                "reading80 art79 sports79 music84\r\n" + 
                "likes\r\n" + 
                "reading46 art25 sports37 music42";
        assertFuzzyEquals(y, systemOut().getHistory());
    }
}
