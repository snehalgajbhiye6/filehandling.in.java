package fileexamples;

import java.io.Serializable;

public class Emplyoeee implements Serializable
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1809424383112597864L;
	private int id;
    private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emplyoeee [id=" + id + ", name=" + name + "]";
	}

	
    
}
