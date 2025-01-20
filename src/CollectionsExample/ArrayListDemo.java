package CollectionsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List<AgentDo> agentData = new ArrayList<AgentDo>();
	AgentDo agentDo = new AgentDo(1, "Khushal");
	agentData.add(agentDo);
	System.out.println(agentData);
	for(AgentDo agent : agentData){
		System.out.println(agent.toString());
	}
	/*List<String> list = new ArrayList<String>();
	list.add("Ramesh");
	list.add("Suresh");
	list.add("Bruce Wayne");
	System.out.println(list);
	
	Iterator<String> itr = list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}*/
	
}
}
