package com.pam.harvestcraft.blocks;

import java.util.HashMap;

public class ItemModelList
{
	private final HashMap<Integer, String> registrations = new HashMap<Integer, String>();
	private final String rootDirectory;


	public ItemModelList()
	{
		rootDirectory = null;
	}


	public ItemModelList(String resourceRoot)
	{
		if (resourceRoot.charAt(resourceRoot.length() - 1) != '/')
		{
			throw new RuntimeException("Resource root path must be relative! (end with '/')");
		}

		rootDirectory = ResourceHelper.getResourcePath(resourceRoot);
	}


	public ItemModelList add(int meta, String path)
	{
		registrations.put(meta, rootDirectory != null ? rootDirectory + path : ResourceHelper.getResourcePath(path));

		return this;
	}

	
	public HashMap<Integer, String> getRegistrations()
	{
		return registrations;
	}
}

