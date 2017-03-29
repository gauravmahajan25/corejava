package afi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Message {
    private Long id;
    private List<String> text;
    
    private static final int[] PRIVATE_VALUES = {1, 2, 3};
     
    public static int[] getPrivateValues() {
		return PRIVATE_VALUES.clone();
	}
	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<String> getText() {
        return text;
    }
    public void setText(List<String> text) {
        this.text = text;
    }
}
