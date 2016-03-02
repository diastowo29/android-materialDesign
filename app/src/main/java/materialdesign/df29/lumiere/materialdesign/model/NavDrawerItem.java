package materialdesign.df29.lumiere.materialdesign.model;

/**
 * Created by Lumiere on 3/2/2016.
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;

    public NavDrawerItem(){

    }
    public NavDrawerItem(boolean showNotify, String title){
        this.showNotify = showNotify;
        this.title = title;
    }

    public boolean isShowNotify(){
        return showNotify;
    }

    public void setShowNotify (Boolean showNotify){
        this.showNotify = showNotify;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
