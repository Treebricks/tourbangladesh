package com.treebricks.tourbangladesh.viewholder;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.treebricks.tourbangladesh.R;

/**
 * Created by fahim on 11/7/16.
 */

public class SuggestionCardViewHolder extends RecyclerView.ViewHolder {

    private ImageView cardSpotImage;
    private TextView cardSpotName;
    private TextView cardSpotLocation;
    private TextView cardSpotDistance;
    public CardView suggestionCard;

    public SuggestionCardViewHolder(View itemView) {
        super(itemView);
        cardSpotImage = (ImageView) itemView.findViewById(R.id.card_spot_image);
        cardSpotName = (TextView) itemView.findViewById(R.id.suggested_spot_name);
        cardSpotLocation = (TextView) itemView.findViewById(R.id.suggested_card_location);
        cardSpotDistance = (TextView) itemView.findViewById(R.id.suggested_card_distance);
        suggestionCard = (CardView) itemView.findViewById(R.id.suggestion_card);
    }

    public void bindData(Context cardContext, String spotImageUrl, String spotName, String spotLocation, String spotDistance)
    {
        Glide.with(cardContext).load(spotImageUrl).crossFade().into(cardSpotImage);
        cardSpotName.setText(spotName);
        cardSpotLocation.setText(spotLocation);
        cardSpotDistance.setText(spotDistance);
    }
}
