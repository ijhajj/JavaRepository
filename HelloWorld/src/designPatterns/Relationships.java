package designPatterns;
import java.util.List;

import java.util.ArrayList;
import org.javatuples.Triplet;

public class Relationships {
	private List<Triplet<Person,Relationship,Person>> relations = new ArrayList<>();

	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

	public void addParentAndChild(Person parent,Person child) {
		relations.add(new Triplet<>(parent,Relationship.PARENT,child));
		relations.add(new Triplet<>(child,Relationship.CHILD,parent));
		
		
	}
}
