class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ClubViewHolder> { 
	 
    List<Club> clubs; 
 
    RecyclerViewAdapter(List<Club> clubs){ 
        this.clubs = clubs; 
    } 
 
    public static class ClubViewHolder extends RecyclerView.ViewHolder { 
        CardView cardView; 
        TextView clubName; 
        ImageView clubLogo; 
 
        ClubViewHolder(View itemView) { 
            super(itemView); 
            cardView = (CardView)itemView.findViewById(R.id.cardView); 
            clubName = (TextView)itemView.findViewById(R.id.club_name); 
            clubLogo = (ImageView)itemView.findViewById(R.id.logo); 
        } 
    } 
 
    @Override 
    public ClubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { 
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false); 
        ClubViewHolder cvh = new ClubViewHolder(view); 
        return cvh; 
    } 
 
    @Override 
    public void onBindViewHolder(ClubViewHolder holder, int position) { 
 
        holder.clubName.setText(clubs.get(position).name); 
        holder.clubLogo.setImageResource(clubs.get(position).logoId); 
 
    } 
 
    @Override 
    public void onAttachedToRecyclerView(RecyclerView recyclerView) { 
        super.onAttachedToRecyclerView(recyclerView); 
    } 
	 
    @Override 
    public int getItemCount() { 
        return clubs.size(); 
    } 
} 