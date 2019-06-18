GridLayoutManager layout = new GridLayoutManager(getActivity(), COLUMN);
mAdapter = new ArtefactListAdapter(artefactsList);
mRecyclerView.setLayoutManager(layout);
mRecyclerView.setAdapter(mAdapter);
