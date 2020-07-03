package zaj18_04_and_05_04_Patterns.strategy.option;


import zaj18_04_and_05_04_Patterns.strategy.domain.Knight;

public class MaleKnightsValidator implements KnightValidator{
	
	public boolean validate(Knight knight){
		String name = knight.getName();
		return name.charAt(name.length()-1)!='a';
	}
	
}