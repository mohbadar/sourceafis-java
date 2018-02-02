// Part of SourceAFIS: https://sourceafis.machinezoo.com
package com.machinezoo.sourceafis.models;

public class Parameters {
	public static final int blockSize = 15;
	public static final double dpiTolerance = 10;
	public static final int histogramDepth = 256;
	public static final double clippedContrast = 0.08;
	public static final double minAbsoluteContrast = 17 / 255.0;
	public static final double minRelativeContrast = 0.34;
	public static final int relativeContrastSample = 168568;
	public static final double relativeContrastPercentile = 0.49;
	public static final VotingParameters contrastVote = new VotingParameters()
		.radius(9)
		.majority(0.86)
		.borderDist(7);
	public static final VotingParameters maskVote = new VotingParameters()
		.radius(7)
		.majority(0.51)
		.borderDist(4);
	public static final VotingParameters blockErrorsVote = new VotingParameters()
		.radius(1)
		.majority(0.7)
		.borderDist(4);
	public static final double maxEqualizationScaling = 3.99;
	public static final double minEqualizationScaling = 0.25;
	public static final double minOrientationRadius = 2;
	public static final double maxOrientationRadius = 6;
	public static final int orientationSplit = 50;
	public static final int orientationsChecked = 20;
	public static final int orientationSmoothingRadius = 1;
	public static final OrientedLineParams parallelSmoothinig = new OrientedLineParams()
		.resolution(32)
		.radius(7)
		.step(1.59);
	public static final OrientedLineParams orthogonalSmoothing = new OrientedLineParams()
		.resolution(11)
		.radius(4)
		.step(1.11);
	public static final VotingParameters binarizedVote = new VotingParameters()
		.radius(2)
		.majority(0.61)
		.borderDist(17);
	public static final int innerMaskBorderDistance = 14;
	public static final double maskDisplacement = 10.06;
	public static final int minutiaCloudRadius = 20;
	public static final int maxCloudSize = 4;
	public static final int maxMinutiae = 100;
	public static final int sortByNeighbor = 5;
	public static final int edgeTableRange = 490;
	public static final int edgeTableNeighbors = 9;
	public static final int thinningIterations = 26;
	public static final int maxPoreArm = 41;
	public static final int shortestJoinedEnding = 7;
	public static final int maxRuptureSize = 5;
	public static final int maxGapSize = 20;
	public static final int gapAngleOffset = 22;
	public static final int toleratedGapOverlap = 2;
	public static final int minTailLength = 21;
	public static final int minFragmentLength = 22;
	public static final int maxDistanceError = 13;
	public static final double maxAngleError = Math.toRadians(10);
	public static final double maxGapAngle = Math.toRadians(45);
	public static final int ridgeDirectionSample = 21;
	public static final int ridgeDirectionSkip = 1;
	public static final int maxTriedRoots = 70;
	public static final int minRootEdgeLength = 58;
	public static final int maxRootEdgeLookups = 1633;
	public static final int minSupportingEdges = 1;
	public static final double distanceErrorFlatness = 0.69;
	public static final double angleErrorFlatness = 0.27;
	public static final double pairCountScore = 0.032;
	public static final double pairFractionScore = 8.98;
	public static final double correctTypeScore = 0.629;
	public static final double supportedCountScore = 0.193;
	public static final double edgeCountScore = 0.265;
	public static final double distanceAccuracyScore = 9.9;
	public static final double angleAccuracyScore = 2.79;
	public static final boolean shapedScore = true;
}
