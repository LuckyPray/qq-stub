package com.tencent.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;

public class ScrollView extends FrameLayout {

    public ScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842880);
    }

    public ScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        throw new RuntimeException("Stub!");
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    protected float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    protected float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    public void addView(View view) {
        throw new RuntimeException("Stub!");
    }

    public void addView(View view, int i2) {
        throw new RuntimeException("Stub!");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new RuntimeException("Stub!");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        throw new RuntimeException("Stub!");
    }

    public void setFillViewport(boolean z) {
        throw new RuntimeException("Stub!");
    }

    public void setSmoothScrollingEnabled(boolean z) {
        throw new RuntimeException("Stub!");
    }

    protected void onMeasure(int i2, int i3) {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    protected void dispatchDraw(Canvas canvas) {
        throw new RuntimeException("Stub!");
    }


    public void requestDisallowInterceptTouchEvent(boolean z) {
        throw new RuntimeException("Stub!");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        throw new RuntimeException("Stub!");
    }

    protected void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        throw new RuntimeException("Stub!");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        throw new RuntimeException("Stub!");
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        throw new RuntimeException("Stub!");
    }


    protected int computeVerticalScrollRange() {
        throw new RuntimeException("Stub!");
    }

    protected int computeVerticalScrollOffset() {
        throw new RuntimeException("Stub!");
    }

    protected void measureChild(View view, int i2, int i3) {
        throw new RuntimeException("Stub!");
    }

    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        throw new RuntimeException("Stub!");
    }

    public void computeScroll() {
        throw new RuntimeException("Stub!");
    }

    public void requestChildFocus(View view, View view2) {
        throw new RuntimeException("Stub!");
    }

    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        throw new RuntimeException("Stub!");
    }

    public void requestLayout() {
        throw new RuntimeException("Stub!");
    }

    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }

    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        throw new RuntimeException("Stub!");
    }

    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        throw new RuntimeException("Stub!");
    }


    public void scrollTo(int i2, int i3) {
        throw new RuntimeException("Stub!");
    }

    public void setEdgeEffectEnabled(boolean z) {
        throw new RuntimeException("Stub!");
    }

    public void setOverScrollMode(int i2) {
        throw new RuntimeException("Stub!");
    }

    public int getOverScrollMode() {
        throw new RuntimeException("Stub!");
    }

    public void draw(Canvas canvas) {
        throw new RuntimeException("Stub!");
    }


    protected boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        throw new RuntimeException("Stub!");
    }


    public void setForeground(Drawable drawable) {
        throw new RuntimeException("Stub!");
    }

    public void setContentBackground(Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
}
