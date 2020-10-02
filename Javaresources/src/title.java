@Entity
public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	@OneToMany(cascade = {CascadeType.ALL})	
	public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
