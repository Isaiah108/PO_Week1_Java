public class solution {
    public static void main(String[] args) {
        String size = "32GB";
        String realSize = actualSize(size);
    }
    public static String actualSize(String size){
        String[] realSize = null;
        if(size.contains("GB")){
            realSize = size.split("GB");
            return realSize[0]+"GB";
        }
        else if(size.contains("MB")){
            realSize = size.split("MB");
            return realSize[0]+"MB";
        }
        else if(size.contains("KB")){
            realSize = size.split("KB");
            return realSize[0]+"KB";
        }
        return null;
    }
}
