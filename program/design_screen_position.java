    private LatLng getScreenPosition() {
        return mMap.getProjection()
					.getVisibleRegion()
					.latLngBounds
					.getCenter();
    }