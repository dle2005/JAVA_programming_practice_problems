package _4;
abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap {
	private int top;
	public Dictionary(int n) {
		keyArray = new String[n];
		valueArray = new String[n]; top = 0;
	}
	public String get(String key) {
		for(int i=0; i<keyArray.length; i++)
			if(key.equals(keyArray[i])) return valueArray[i];
		return "null";
	}
	public void put(String key, String value) {
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value; return;
			}
		}
		keyArray[top] = key;
		valueArray[top] = value; top++;
	}
	public String delete(String key) {
		for(int i=0; i<keyArray.length; i++)
			if(key.equals(keyArray[i])) valueArray[i] = "null";
		return "null";
	}
	public int length() { return top+1; }
}
public class _10 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������  ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}
}
