public class MapActivityTest {

    MapActivity SUT = new MapActivity();
    List<Artefact> list = new ArrayList<>();

    @Before
    public void prepareList(){}

    @After
    public void clearList(){}

    @Test
    public void filterAge_BcToBc_ResultSize1(){
        List<Artefact> result = SUT.filterArtefactList(
						list, BcAc.BEFORE_CHRIST, 
						65, false);

        assertTrue(result.size() == 1);
    }
}