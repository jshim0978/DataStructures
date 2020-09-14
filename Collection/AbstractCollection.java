package collection;

public abstract class AbstractCollection implements Collection1{

	public boolean contains(Object object){
	/*
	�� 諛섎났�옄(Iterator)瑜� �솢�슜�븯�뿬 object媛� �빐�떦 �옄猷뚭뎄議� �궡�뿉 議댁옱�븯�뒗 吏� �솗�씤
	�� 議댁옱 �븳�떎硫� true 諛섑솚, 議댁옱�븯吏� �븡�쑝硫� false 諛섑솚
	�� 諛곗뿴怨� 由ъ뒪�듃媛� 諛섎났�옄瑜� �솢�슜�븯硫� 援ы쁽 諛⑸쾿�씠 媛숆린 �븣臾몄뿉 AbstractCollection 異붿긽�겢�옒
	�뒪 �궡遺��뿉 援ы쁽
	*/
		iterator it = iterator();
		
		if(object ==null)
			while (it.hasNext()){
				if(it.next() == null) 	return true;
			}
		else 
			while(it.hasNext()){
				if(object.equals(it.next()))	return true;
			}
	
		return false;
		
	}

	
	
	
}
