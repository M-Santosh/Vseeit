package com.santosh.vseeit;
import java.util.List;

public class HomePagemodel {
    public static final int BANNER_SLIDER = 0;
    public static final int STRIP_AD_BANNER = 1;
    public static final int HORIZONTAL_PRO_VIEW = 2;
    public static final int GRID_PRO_VIEW = 3;
    private int type;

    ///////Banner slider
    private List<SliderModel> sliderModelList;
    public HomePagemodel(int type, List<SliderModel> sliderModelList) {
        this.type = type;
        this.sliderModelList = sliderModelList;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public List<SliderModel> getSliderModelList() {
        return sliderModelList;
    }
    public void setSliderModelList(List<SliderModel> sliderModelList) {
        this.sliderModelList = sliderModelList;
        ///////Banner slider
    }
    /////Banner slider



    ///////STRIP AD LAYOUT
    private int resource;
    private String bgcolor;

    public HomePagemodel(int type, int resource, String bgcolor){
        this.type = type;
        this.resource = resource;
        this.bgcolor = bgcolor;
    }
    public int getResource() {
        return resource;
    }
    public void setResource(int resource) {
        this.resource = resource;
    }
    public String getBgcolor() {
        return bgcolor;
    }
    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }
    ///////STRIP AD LAYOUT

    ////////////HORIZONTAL PRO VIEW & GRID VIEW
    private String title;
    private List<HorizontalProductModel> horizontalProductModelList;
    public HomePagemodel(int type, String title, List<HorizontalProductModel>horizontalProductModelList){
        this.type = type;
        this.title = title;
        this.horizontalProductModelList = horizontalProductModelList;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<HorizontalProductModel> getHorizontalProductModelList() {
        return horizontalProductModelList;
    }
    public void setHorizontalProductModelList(List<HorizontalProductModel> horizontalProductModelList) {
        this.horizontalProductModelList = horizontalProductModelList;
    }
    ////////////HORIZONTAL PRO VIEW & GRID VIEW

}
