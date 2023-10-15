using System.Collections;
using System.Collections.Generic;
using UnityEditor;
using UnityEngine;

public class FlashyTexManager : MonoBehaviour
{
    [SerializeField] private string flashyTexPath = "flashy.png";
    
    // Start is called before the first frame update
    void Start()
    {
        /*GameObject prefabToModify = AssetDatabase.LoadAssetAtPath<GameObject>("Assets/Scenes/flashy.prefab");

        if (prefabToModify == null)
        {
            Debug.LogError("Prefab not found.");
            return;
        }

        SpriteRenderer spriteRenderer = prefabToModify.GetComponentInChildren<SpriteRenderer>();
        Sprite sprite = Resources.Load<Sprite>(flashyTexPath);

        if (sprite == null)
        {
            Debug.LogError("Image not found in Resources: " + flashyTexPath);
            return;
        }
        
        spriteRenderer.sprite = sprite;

        // Save the changes back to the original prefab asset
        PrefabUtility.SavePrefabAsset(prefabToModify);
        AssetDatabase.Refresh();*/
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
