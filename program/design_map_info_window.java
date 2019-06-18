mMap.setOnInfoWindowClickListener(new GoogleMap.
						OnInfoWindowClickListener() {
@Override
public void onInfoWindowClick(Marker marker) {
	Log.d(TAG, "onInfoWindowClick: ");
	ApplicationClass.mScreenPosition = getScreenPosition();
	Artefact tempArtefact = (Artefact) marker.getTag();
	Intent intent = new Intent(MapActivity.this, 
						ArtefactActivity.class);
	intent.putExtra(getResources()
				.getString(R.string
					.navigate_to_artefact_activity),
					"markerClick");
	intent.putExtra(Util.ARTEFACT_OBJECT_ID, 
					tempArtefact.getObjectId());
	startActivity(intent);
}
});