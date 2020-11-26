package org.kvarela.pvp_example;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "Person")
public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PERSON_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "PERSON_ID_SEQ", name = "PERSON_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String name;

	private java.lang.Integer age;

	@org.kie.api.definition.type.Label(value = "ww")
	private java.lang.String ww;

	public Person() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getWw() {
		return this.ww;
	}

	public void setWw(java.lang.String ww) {
		this.ww = ww;
	}

	public Person(java.lang.Long id, java.lang.String name,
			java.lang.Integer age, java.lang.String ww) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.ww = ww;
	}

}