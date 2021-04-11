class ExpandableListData { 
	 
    public static HashMap<String, List<String>> getData() { 
	 
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>(); 
	 
        List<String> Apple = new ArrayList<String>(); 
	 
        Apple.add("iPhone"); 
        Apple.add("iPad"); 
        Apple.add("Macbook"); 
	 
        List<String> Samsung = new ArrayList<String>(); 
	 
        Samsung.add("Galaxy S"); 
        Samsung.add("Samsung Note"); 
        Samsung.add("Samsung TV"); 
	 
        expandableListDetail.put("Samsung", Samsung); 
        expandableListDetail.put("Apple", Apple); 
	 
        return expandableListDetail; 
    } 
} 