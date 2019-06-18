mapFragment.getMapAsync(new OnMapReadyCallback() {
@Override
public void onMapReady(GoogleMap googleMap) {

		// Map is called from ArtefactListFragment via drawer 
		// and filter is set
if (mFilterHelper.isListFilterSet() || 
		mFilterHelper.isMapFilterSet()) {
	for (int i = 0; i < mFilterHelper.getFilteredArtefactList()
									 .size(); i++) {
		createMarker(mFilterHelper.getFilteredArtefactList()
								  .get(i));
	}
// Map is called from ArtefactListFragment 
// via "show search result on map" button, filter is set
} else if (getIntent().getStringExtra(Util.ORIGIN).equals(Util.FILTER) 
			&& !ApplicationClass.mFilteredArtefactList
									.isEmpty()) {
	for (int i = 0; i < ApplicationClass.mFilteredArtefactList
								 .size(); i++) {
		createMarker(ApplicationClass.mFilteredArtefactList
								 .get(i));
	}
// initial call, no filter is set
} else {
	if (ApplicationClass.mArtefactList.size() > 0) {
		for (int i = 0; i < ApplicationClass.mArtefactList
								.size(); i++) {
			createMarker(ApplicationClass.mArtefactList
							    .get(i));
		}
	}
}
}
}


protected Marker createMarker(Artefact artefact) {
	int markerArtefactIcon = getMarkerArtefactIcon(artefact);
	Marker marker = mMap.addMarker(new MarkerOptions()
			.position(new LatLng(artefact.getLatitude(), 
							artefact.getLongitude()))
			.title(artefact.getArtefactName())
			.snippet(artefact.getArtefactDescription())
			.icon(bitmapDescriptorFromVector(this, 
							markerArtefactIcon)));
	marker.setTag(artefact);

	return marker;
}
				