@Entity
public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String description;
	@OneToMany(cascade = {CascadeType.ALL})	
	public String getDescription() {
        return description;
    }
    public void setDescriptionString description) {
        this.description = description;
    }

}
