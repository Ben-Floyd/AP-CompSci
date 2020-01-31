package ch8.two.homework.PP1;

public class ComboLock {
	private enum Turn {LEFT, RIGHT};
	private int[] combo, comboIn;
	private Turn[] turns;
	private int count;
	
	public int tick;
	
	public ComboLock(int a, int b, int c){
		combo = new int[] {a, b, c};
		comboIn = new int[3];
		turns  = new Turn[3];
		tick = 0;
		count = 0;
	}
	
	public void turnRight(int ticks){
		if((tick - ticks) < 0){
			tick = 39 - (Math.abs(tick - ticks) - 1);
		} else{
			tick -= ticks;
		}
		comboIn[count] = tick;
		turns[count] = Turn.RIGHT;
		count = (count + 1) % 3;
	}
	
	public void turnLeft(int ticks){
		if((tick + ticks) > 39){
			tick = (tick + ticks - 39 - 1);
		} else{
			tick += ticks;
		}
		turns[count] = Turn.LEFT;
		comboIn[count] = tick;
		count = (count + 1) % 3;
	}
	
	public void reset(){
		tick = 0;
	}
	
	public boolean isOpen(){
		if(isEqual(combo, comboIn) && isEqual(turns, new Turn[]{Turn.RIGHT, Turn.LEFT, Turn.RIGHT})){
			return true;
		} else{
			return false;
		}
	}
	
	private boolean isEqual(int[] arr1, int[] arr2){
		int count = 0;
		for(int i = 0;  i < arr1.length; i++){
			if(arr1[i] == arr2[i]){
				count++;
			}
		}
		if(count == 3){
			return true;
		} else{
			return false;
		}
	}
	
	private boolean isEqual(Turn[] arr1, Turn[] arr2){
		int count = 0;
		for(int i = 0;  i < arr1.length; i++){
			if(arr1[i] == arr2[i]){
				count++;
			}
		}
		if(count == 3){
			return true;
		} else{
			return false;
		}
	}
}
