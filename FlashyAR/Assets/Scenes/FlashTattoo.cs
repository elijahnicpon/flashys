using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FlashTattoo : MonoBehaviour
{
    [SerializeField] private float scaleFactor = 0.2f;
    // Start is called before the first frame update
    private GameObject currentTattoo = null;
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void ScaleUp()
    {
        currentTattoo = GameObject.FindWithTag("Flashy");
        if (this.currentTattoo != null)
        {
            currentTattoo.transform.localScale *= 1.0f + scaleFactor;
        }
    }

    public void ScaleDown()
    {
        this.currentTattoo = GameObject.FindWithTag("Flashy");
        if (this.currentTattoo != null)
        {
            this.currentTattoo.transform.localScale *= 1.0f - scaleFactor;
        }
    }

    public void SwitchFlashy(Int32 index)
    {        
        currentTattoo = GameObject.FindWithTag("Flashy");
        if (this.currentTattoo == null)
        {
            return;
        }
        Debug.Log("Flashies/flash" + (index + 1).ToString());
        Sprite newFlash = Resources.Load<Sprite>("Flashies/flash" + (index + 1).ToString());
        if (newFlash == null)
        {
            Debug.LogError("Selected flash is null!");
            return;
        }
        SpriteRenderer spriteRenderer = currentTattoo.GetComponentInChildren<SpriteRenderer>();
        spriteRenderer.sprite = newFlash;
    }
}
