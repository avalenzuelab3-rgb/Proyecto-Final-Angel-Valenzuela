package PrimitivesUnitTest;

public class PrimitivesUnitTest {
	 
    
    public void whenModifyingPrimitives_thenOriginalValuesNotModified() {
        
        int x = 1;
        int y = 2;
       
        // Before Modification
        assertEquals(x, 1);
        assertEquals(y, 2);
        
        modify(x, y);
        
        // After Modification
        assertEquals(x, 1);
        assertEquals(y, 2);
    }
    
    private void assertEquals(int x, int i) {
		// TODO Auto-generated method stub
		
	}

	public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }
}