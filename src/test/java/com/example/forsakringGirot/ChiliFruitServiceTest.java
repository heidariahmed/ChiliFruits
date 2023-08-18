package com.example.forsakringGirot;

/*
class ChiliFruitServiceTest {

    private ChiliFruitService chiliFruitService;

    @Mock
    private ChiliFruitRepository chiliFruitRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        chiliFruitService = new ChiliFruitServiceImpl(chiliFruitRepository);
    }

    @Test
    void testGetAllChiliFruits() {
        List<ChiliFruit> chiliFruits = new ArrayList<>();
        // Populate chiliFruits list

        when(chiliFruitRepository.findAll()).thenReturn(chiliFruits);

        List<ChiliFruit> result = chiliFruitService.getAllChiliFruits();

        // Assert result based on expected chiliFruits list
    }

    @Test
    void testUpdateQuantity() {
        Long chiliFruitId = 1L;
        int newQuantity = 50;

        ChiliFruit chiliFruit = new ChiliFruit();
        // Populate chiliFruit entity

        when(chiliFruitRepository.findById(chiliFruitId)).thenReturn(Optional.of(chiliFruit));

        chiliFruitService.updateQuantity(chiliFruitId, newQuantity);

        // Verify that the quantity was updated correctly
        verify(chiliFruitRepository, times(1)).save(chiliFruit);
    }
}*/
