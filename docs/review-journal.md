# Review Journal

The repository goal stays the same: package a Java local lab for policy analysis with layout fixtures, stable geometry snapshots, and documented operating limits. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 165, lane `ship`
- `stress`: `quota pressure`, score 185, lane `ship`
- `edge`: `route drift`, score 185, lane `ship`
- `recovery`: `secret scope`, score 182, lane `ship`
- `stale`: `rollout width`, score 184, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
